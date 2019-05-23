class GroovyTut{
  static void main(String[] args){

    println("Hello World");
    print("What's your name ");
    def fName = System.console().readLine();
    println("Hello " + fName);
    print("Enter first number  ");
    def num1 = System.console().readLine().toDouble();
    print("Enter 2nd number  ");
    def num2 = System.console().readLine().toDouble();
    printf("%.2f + %.2f = %.2f \n", [num1, num2, (num1 + num2)]);

  }

}
