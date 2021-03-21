using System;

namespace Quera
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            int Row = Convert.ToInt32(input.Split(' ')[0]);
            int Seat = Convert.ToInt32(input.Split(' ')[1]);
            string Dir = "";

            if (Seat >= 1 && Seat <= 10)
                Dir = "Right";
            else
                Dir = "Left";

            Row = 10 - Row + 1;

            if (Dir == "Left")
                Seat = 20 - Seat + 1;

            Console.WriteLine(Dir + " " + Row + " " + Seat);
        }
    }
}
