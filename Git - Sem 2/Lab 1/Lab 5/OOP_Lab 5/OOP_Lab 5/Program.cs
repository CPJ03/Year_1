using System;

namespace OOP_Lab_5
{
    class Student
    {
        public string name;
        public int id;

        public void rideToClass()
        {
            Console.WriteLine("I am going to ride to class.");
        }

        static void Main(string[] args)
        {
            // Creating object
            Student stud = new Student();

            // Field
            stud.name = "Cheng Pin-Jie.";
            stud.id = 21000548;

            // Method and Display
            Console.WriteLine("I am " + stud.name);
            Console.WriteLine("My id is " + stud.id);
            stud.rideToClass();

        }
    }
}
