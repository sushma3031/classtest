class java1{
    int age;
    java1(int a){
        age=a;
    }
    void display(){ 
        System.out.println("age is "+age);
        }
        public static void main(String[]args){
            java1 obj=new java1(20);
            obj.display();
        }
}