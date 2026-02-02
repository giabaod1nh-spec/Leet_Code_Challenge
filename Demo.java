class Student{
    int rollno; 
    String name;
    int marks; 
}

public class Demo{
    public static void main(String[] args) {
        
        StringBuffer sb  = new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Ready") ; 
        System.out.println(sb);





        Student s1 = new Student(); 
        s1.rollno = 1 ; 
        s1. name = "Dinh Gia Bao" ; 
        s1.marks =  88 ; 

        Student s2 = new Student(); 
        s2.rollno = 2 ; 
        s2.name = "Dinh Gia";
        s2.marks =  90 ; 

        Student s3 = new Student(); 
        s3.rollno = 3 ; 
        s3.name = "Dinh" ; 
        s3.marks = 95; 

        Student students[] =  new Student[3]; 
        students[0] = s1;
        students[1] = s2 ; 
        students[2] = s3; 

        for (Student stud:students){
            System.out.println(stud.name + " " + stud.marks);
        }
        
        String name = new String("navin"); 
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(1));
        
        
        int nums[] =  new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;

        for(int i = 0 ; i < nums.length; i ++){
            System.out.println(nums[i]);
        }
    }
}