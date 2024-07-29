//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Button btnLogin=new Button();
        btnLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("user is logged in");
            }
        });
        Button btnLogout=new Button();
        btnLogout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("user is logged out");
            }
        });
    }
}