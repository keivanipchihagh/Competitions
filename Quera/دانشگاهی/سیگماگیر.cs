using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Quera
{
    class Program
    {
        static void Main(string[] args)
        {
            int num1 = Convert.ToInt32(Console.ReadLine());
            int num2 = Convert.ToInt32(Console.ReadLine());
            int sum = 0;

            for (int i = -10; i <= num2; i++)
                for (int j = 1; j <= num1; j++)
                    sum += Convert.ToInt32(Math.Pow(i + j, 3)) / Convert.ToInt32(Math.Pow(j, 2));

            Console.Write(sum);
            Console.ReadLine();
        }
    }
}
