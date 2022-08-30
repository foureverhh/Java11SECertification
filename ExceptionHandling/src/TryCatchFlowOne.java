public class TryCatchFlowOne {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("a");
        }catch (Exception e) {
            sb.append("b");
        }finally {
            sb.append("c");
        }
        sb.append("d");
        System.out.println(sb);

        sb = new StringBuilder();
        String str = null;
        try{
            sb.append("a");
            str.toUpperCase(); // null pointer exception
            sb.append("b"); //will not execute
        }catch (IllegalArgumentException e){
            sb.append("c"); //skip
        }catch (Exception e){
            sb.append("d");
        }finally {
            sb.append("e");
        }
        sb.append("f");
        System.out.println(sb);
    }
}
