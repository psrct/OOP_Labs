class Variable{
    public static void main(String[] args) {
        //นิยามตัวแปรแบบไม่ระบุค่า
        /*int number1;
        boolean status;
        char alphabet;
        float number2;
        double number3;

        //นิยามตัวแปรแบบระบุค่า
        char alpha='A';
        boolean statuss=true;

        //หลายบรรทัดในครั้งเดียว
        int a =0, b = 1, c=2;*/
        final int NUM1=10;
        float num2=20.20f;
        num2 = 50;
        System.out.println("ค่าที่ 1 = " + NUM1);
        System.out.println("ค่าที่ 2 = " + num2);
        
        //เล็ก => ใหญ่
        int numInt=10;
        double numDouble=numInt;

        // ใหญ่ => เล็ก
        double numDouble1=10.0;
        int numInt1=(int)numDouble1;

        System.out.println(numInt1);
        System.out.println(numDouble1);
    }
}