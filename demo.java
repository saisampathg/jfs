class demo
{
    int rollno;
    String name;
    int age;
    String course;
    public static void main(String args[])
    {
        demo ref = new demo();
        ref.rollno=78;
        ref.name="Sampath";
        ref.age=20;
        ref.course="CSE";
        System.out.println(ref.rollno);
        System.out.println(ref.name);
        System.out.println(ref.age);
        System.out.println(ref.course);
    }
}