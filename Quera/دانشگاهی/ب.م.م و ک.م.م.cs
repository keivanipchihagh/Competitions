using System;

namespace Quera
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] inputs = (Console.ReadLine().Split(' '));
            ulong[] numbers = new ulong[2];
            numbers[0] = Convert.ToUInt64(inputs[0]);
            numbers[1] = Convert.ToUInt64(inputs[1]);

            Console.WriteLine(GCD(numbers[0], numbers[1]) + " " + determineLCM(numbers[0], numbers[1]));
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

        public static ulong determineLCM(ulong a, ulong b)
        {
            ulong num1, num2;
            if (a > b)
            {
                num1 = a; num2 = b;
            }
            else
            {
                num1 = b; num2 = a;
            }

            for (ulong i = 1; i < num2; i++)
            {
                if ((num1 * i) % num2 == 0)
                {
                    return i * num1;
                }
            }
            return num1 * num2;
        }

    }
}
