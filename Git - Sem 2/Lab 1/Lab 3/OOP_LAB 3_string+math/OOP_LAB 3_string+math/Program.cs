using System;

namespace OOP_LAB_3_string_math
{
    class Program
    {
        static void Main(string[] args)
        {
            // Concatenation
            string first = "My ";
            string second = "favourite colour ";
            string third = "is ";
            string fourth = "orange ";
            string conc_line = first + second + third + fourth;
            Console.WriteLine("Concatenation:");
            Console.WriteLine(conc_line);
            Console.WriteLine("\n");

            // Interpolation
            Console.WriteLine("Interpolation:");
            string inter_line = $"{first}{second}{third}{fourth}";
            Console.WriteLine(inter_line);
            Console.WriteLine("\n");

            // Length
            Console.WriteLine("Length:");
            string length_line = "My name is Cheng Pin-Jie";
            Console.WriteLine("My name is Cheng Pin-Jie");
            Console.WriteLine("The length of the txt string is: " + length_line.Length);
            Console.WriteLine("\n");

            // Uppercase & Lowercase
            string upper_lower_line = "mY naME Is CHEng Pin-JIE";
            Console.WriteLine("Uppercase and Lowercase");
            Console.WriteLine("mY naME is CHEng Pin-JIE");
            Console.WriteLine("Uppercase: " + upper_lower_line.ToUpper());
            Console.WriteLine("Lowercase: " + upper_lower_line.ToLower());
            Console.WriteLine("\n");

            // Access Index
            string acc_line = "My name is Cheng Pin-Jie";
            Console.WriteLine("Access Index");
            Console.WriteLine(acc_line[4]);
            Console.WriteLine("\n");

            // Special Characters
            Console.WriteLine("Special Characters");
            Console.WriteLine("My name is \"Cheng Pin-Jie\"");
            Console.WriteLine("\n");

            // Max
            Console.WriteLine("Max");
            Console.WriteLine(Math.Max(5612361234986514685, 6589649656532145654));
            Console.WriteLine("\n");

            // Min
            Console.WriteLine("Max");
            Console.WriteLine("5612361234986514685 compare with 6589649656532145654");
            Console.WriteLine("The largest is: " + Math.Min(5612361234986514685, 6589649656532145654));
            Console.WriteLine("\n");

            // Square Root
            Console.WriteLine("Square root");
            Console.WriteLine("5612361234986514685 compare with 6589649656532145654");
            Console.WriteLine("The smaller is：" + Math.Max(5612361234986514685, 6589649656532145654));
            Console.WriteLine("\n");

            // Absolute
            Console.WriteLine("Absolute");
            Console.WriteLine(Math.Abs(-10546));
            Console.WriteLine("\n");

            // Round
            Console.WriteLine("Round");
            Console.WriteLine(Math.Round(73.5));
            Console.WriteLine("\n");
        }
    }
}