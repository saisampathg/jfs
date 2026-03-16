class course
{
    int courseId;
    String coursename;
    int courseDuration;
    public static void main(String args[])
    {
        course ref= new course();
        ref.courseId=78;
        ref.coursename="Full Stack Java";
        ref.courseDuration=100;

        System.out.println(ref.courseId);
        System.out.println(ref.coursename);
        System.out.println(ref.courseDuration);
    }
}