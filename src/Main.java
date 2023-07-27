public class Main {
    public static void main(String[] args) {

        //1 step

        String[] wordListOne={"Red", "Racer", "Pencil", "Ball", "Fire", "Car"};
        String[] wordListTwo={"Seven", "Dancer", "Juice", "Brother", "Fat"};
        String[] wordListThree={"Dark", "Six", "Sunny", "Week", "Day"};

        //2 step

        int oneLength=wordListOne.length;
        int twoLength=wordListTwo.length;
        int threeLength=wordListThree.length;

        //3 step

        int rand1=(int) (Math.random() * oneLength);
        int rand2=(int) (Math.random() * twoLength);
        int rand3=(int) (Math.random() * threeLength);

        //4 step

        String phrase=wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree [rand3];

        //5 step

        System.out.println("We want" + " " + phrase);

    }
}