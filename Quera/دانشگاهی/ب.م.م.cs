using System;

namespace Quera
{
    class Program
    {
        static void Main(string[] args)
        {
            ulong num1 = Convert.ToUInt64(Console.ReadLine());
            ulong num2 = Convert.ToUInt64(Console.ReadLine());
            Console.WriteLine(GCD(num1, num2));
        }

        private static ulong GCD(ulong a, ulong b)
        {
            while (a != 0 && b != 0)
            {
                if (a > b)
                    a %= b;
                else
                    b %= a;
            }

            return a == 0 ? b : a;
        }
    }
}
