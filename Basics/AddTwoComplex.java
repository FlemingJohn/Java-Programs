class AddTwoComplex {

    int real;
    int image;

    public AddTwoComplex(int r, int i){
        this.real = r;
        this.image = i;
    }

    public void show(){
        System.out.println(this.real + "+i " + this.image);
    }

   public static AddTwoComplex add(AddTwoComplex n1, AddTwoComplex n2){

    AddTwoComplex result = new AddTwoComplex(0, 0);

    result.real = n1.real + n2.real;

    result.image = n1.image + n2.image;

    return result;

   }

   public static void main(String arg[]){

    AddTwoComplex c1 = new AddTwoComplex(4, 5);
    
    AddTwoComplex c2 = new AddTwoComplex(6, 7);

    System.out.println("first Complex Number");
    c1.show();

    System.out.println("Second complex Number");
    c2.show();

    AddTwoComplex result = add(c1,c2);

    System.out.println("Addition is :");
    result.show();


   }

}