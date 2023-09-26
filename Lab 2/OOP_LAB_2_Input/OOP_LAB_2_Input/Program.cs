using System;

namespace OOP_LAB2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Name: ");
            string name = Console.ReadLine();
            Console.WriteLine("Age: ");
            int age = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("ID: ");
            int ID = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Hello my name is " + name + ", my age is " + age + ", with matric ID " + ID);
        }
    }
}
