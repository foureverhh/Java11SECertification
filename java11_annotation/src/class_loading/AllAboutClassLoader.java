package class_loading;

public class AllAboutClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader); //systemClassLoader or AppClassLoader
        ClassLoader extensionClassLoader = systemClassLoader.getParent();
        System.out.println(extensionClassLoader); //extensionClassLoader or PlatformClassLoader
        ClassLoader bootstraoClassLoader = extensionClassLoader.getParent();
        System.out.println(bootstraoClassLoader);
        System.out.println("***** getClassLoader() *****");
        //Test current class classLoader
        Class<?> currentClz = Class.forName("class_loading.AllAboutClassLoader");
        ClassLoader currentClassLoader = currentClz.getClassLoader();
        System.out.println(currentClassLoader);

        // Test jdk classLoader
        ClassLoader jdkClassLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(jdkClassLoader);

        // get class path
        System.out.println(System.getProperty("java.class.path"));

        // dual classLoader
        /*
        * check from appClassLoader to bootstrapClassloader
        * if class is already loaded then it will not load again by other classLoader
        * */
    }



}
