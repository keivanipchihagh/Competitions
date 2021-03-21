using System;

namespace Quera
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] Str = new string[5];
            string final = "";
            for (int i = 0; i < Str.Length; i++)
            {
                Str[i] = Console.ReadLine();
                if (Str[i].Contains("HAFEZ") || Str[i].Contains("MOLANA"))
                    final += (i + 1) + " ";
            }

            if (final != "")
                Console.WriteLine(final);
            else
                Console.WriteLine("NOT FOUND!");
        }
    }
}
