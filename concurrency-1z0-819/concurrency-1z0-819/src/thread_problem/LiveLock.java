package thread_problem;

public class LiveLock {
    public static void main(String[] args) {
        PhoneCall john = new PhoneCall("John");
        PhoneCall tom = new PhoneCall("Tom");
        HangUp hangUpAction = new HangUp(john);
        // same hang up tempt, but each side would have the other side to hang up
        new Thread(() -> john.endCallWith(hangUpAction,tom)).start();
        new Thread(() -> tom.endCallWith(hangUpAction,john)).start();
    }

    static class HangUp {
        private PhoneCall caller;
        public HangUp(PhoneCall caller) {
            this.caller = caller;
        }
        void setCaller(PhoneCall caller) {
            this.caller = caller;
        }

        void end()  {
            System.out.println(caller.name + " has hang up!");
        }
    }
    static class PhoneCall {
        private final String name;
        private boolean isDone;
        void endCallWith(HangUp hangUp,PhoneCall receiver) {
            while (!isDone) {
                if(hangUp.caller != this) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        continue;
                    }
                    continue;
                }
                if(!receiver.isDone) {
                    System.out.println("Caller" + name + ": No you should hang up " + receiver.name);
                    hangUp.setCaller(receiver);
                    continue;
                }
                hangUp.end();
                receiver.isDone = true;
                isDone = true;
            }
        }

        public PhoneCall(String name) {
            this.name = name;
            isDone = false;
        }

        public boolean isDone() {
            return isDone;
        }

        public void setDone(boolean done) {
            isDone = done;
        }

        public String getName() {
            return name;
        }
    }
}
