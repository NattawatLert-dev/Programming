package a04exceptions_handling;

public class A1IntroToExceptions {
    public static void main(String[] args) {
        
        // Exception = เหตุการณ์ผิดพลาด (Error) ที่เกิดขึ้นระหว่างการรันโปรแกรม (Runtime) ทำให้โปรแกรมไม่สามารถทำงานต่อได้ตามปกติ

        // try...catch
          try {

            int x = 10 / 0;
            System.out.println(x);

        } catch (Exception e) {

            System.out.println("Error");

        }

        System.out.println("Program End");

        // try...catch หลายอัน
        try{
            
            int[] arr = {1,2};
            
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            
            System.out.println("Array Error");
        }
        catch(Exception e){
            
            System.out.println("Other Error");
        }

        //finally = ทำงานเสมอ แม้จะเกิด Exception หรือไม่ก็ตาม
        try{
            
            int y = 10/2;
            System.out.println(y);
        }
        catch(Exception e){
            
            System.out.println("Error");
        
        }
        finally{
            
            System.out.println("Finish");
        }
        
        // throw = ใช้สร้าง Exception เอง
        try{
            
            int age = -5;
            
            if(age < 0){
                
                throw new Exception("Age invalid");
            }
            System.out.println("Age :" + age);
        }
        catch(Exception e){
           
            System.out.println(e.getMessage());
        
        }

        
        try {

            withdraw(-100);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
    // throws ด้วย methods
    static void withdraw(int money) throws Exception{

        if (money <= 0) {
            throw new Exception("จำนวนเงินต้องมากกว่า 0");
        }

        System.out.println("ถอนเงิน " + money + " บาท");
    }
}
