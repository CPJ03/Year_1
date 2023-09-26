using System;

namespace OOP_Lab_4_Condition
{
    class Program
    {
        static void Main(string[] args)
        {
            // Input
            Console.WriteLine("What year were you born in?:");
            Console.Write("Year: ");
            int ans = Convert.ToInt32(Console.ReadLine());

            // Filter
            string gen = "";
            if (ans >= 1946 && ans <= 1964)
            {
                gen = "Baby Boomer";
            }
            else if (ans >= 1965 && ans <= 1980)
            {
                gen = "Gen X";
            }
            else if (ans >= 1981 && ans <= 1996)
            {
                gen = "Millennial";
            }
            else if (ans >= 1997 && ans <= 2012)
            {
                gen = "Gen Z";
            }
            else
            {
                Console.WriteLine("Woahh bruh...");
            }

            // Output
            Console.WriteLine("You're " + gen);
        }
    }
}
