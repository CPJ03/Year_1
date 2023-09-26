using System;

namespace OOP_Lab_6
{
    class Animal
    {
        private string type;
        public string Type
        {
            get { return type; }
            set { type = value; }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            // Create object
            Animal cat1 = new Animal();
            cat1.Type = "Cat";
                Console.WriteLine(cat1.Type);
        }
    }
}
