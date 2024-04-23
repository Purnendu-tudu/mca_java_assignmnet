public class CommandLineParameters {
    public static void main(String[] args) {
        System.out.println("Number of command line parameters: " + args.length);
        System.out.println("Command line parameters:");
        
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
