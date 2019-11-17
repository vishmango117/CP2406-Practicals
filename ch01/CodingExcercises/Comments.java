/** Java Program to demonstrate the use of different methods of including comments
    Prepared by: Vishal Manghnani 13759845 **/


public class Comments {

    //Variable Instances for Class Comments
    private String comment_definition;
    private String comment_method1;
    private String comment_method2;
    private String comment_method3;

    /*Constructor invoking with the Parameters */
    public Comments(String comment_definition, String comment_method1, String comment_method2, String comment_method3) {
        this.comment_definition = comment_definition;
        this.comment_method1 = comment_method1;
        this.comment_method2 = comment_method2;
        this.comment_method3 = comment_method3;
    }

    public static void main(String[] args) {
        Comments aboutComments = new Comments(
                "Program Comments are nonexecuting statements" +
                        " you add to a file for the purpose of documentation",
                "1. Single Line Comment which is using // on a single line",
                "2. Multiline Comment which is using /* to open and */ to close comments",
                "3. Documentation Comment which uses /** to open and **/ to close comments"
        );

        System.out.println(aboutComments.comment_definition);
        System.out.println(aboutComments.comment_method1);
        System.out.println(aboutComments.comment_method2);
        System.out.println(aboutComments.comment_method3);
    }
}
