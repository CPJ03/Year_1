using System;

namespace OOP_Lab_7
{
    abstract class animal
    {
        public abstract void sound();
    }

    class Cat : animal
    {
        public override void sound()
        {
            Console.WriteLine("Cat goes meow");
        }
    }

    interface Ianimal
    {
        void DogSound();
    }

    class Dog: Ianimal
    {
        public void DogSound()
        {
            Console.WriteLine("Dog goes woff");
        }
    }
    class Program
    {
        static void Main (string[] args)
        {
            Cat c1 = new Cat();
            c1.sound();

            Dog d1 = new Dog();
            d1.DogSound();

        }
    }
}