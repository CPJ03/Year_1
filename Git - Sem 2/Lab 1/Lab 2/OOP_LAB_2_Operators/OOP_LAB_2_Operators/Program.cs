using System;

namespace OOP_LAB_2_Operators
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = 6;
            int b = 2;

            // Arithmetic Operators
            Console.WriteLine(a + b);
            Console.WriteLine(a - b);
            Console.WriteLine(a * b);
            Console.WriteLine(a / b);
            Console.WriteLine(a % b);
            Console.WriteLine(a++);
            Console.WriteLine(b--);

            // Comparison Operators
            Console.WriteLine(a == b);
            Console.WriteLine(a != b);
            Console.WriteLine(a > b);
            Console.WriteLine(a >= b);
            Console.WriteLine(a < b);
            Console.WriteLine(a <= b);
        }
    }
}
