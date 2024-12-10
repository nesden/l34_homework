public class SomethingIsWrong {
    public static class Rectangle {
        private int width;
        private int height;

        int area;//ex5

        public int area() {
            return this.height * this.width;
        }

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;


            this.area=this.area();//ex5
        }
        public void getArea() {// ex5
            System.out.printf("area of the rectangle is %d its width is %d and its height is %d",this.area,this.width,this.height);
        }
    }




    public static void main(String[] args) {
//    Rectangle monkey;
//    monkey.width=50;
        Rectangle myRect = new Rectangle(40, 50);
        System.out.println("the rectangle area is " + myRect.area());

        myRect.getArea();//ex5
    }
}
