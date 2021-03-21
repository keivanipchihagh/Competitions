using System;

namespace Quera
{
    class Program
    {
        static void Main(string[] args)
        {
            int movieCount = int.Parse(Console.ReadLine());
            string[] movieArray = new string[movieCount];

            for (int i = 0; i < movieArray.Length; i++)
            {
                movieArray[i] = Console.ReadLine();

                string[] temp = movieArray[i].Split(' ');
                movieArray[i] = "";
                for (int j = 0; j < temp.Length; j++)
                {
                    string word = temp[j];
                    string newWord = "";
                    newWord += word.Substring(0, 1).ToUpper();
                    newWord += word.Substring(1, temp[j].Length - 1).ToLower();
                    newWord += " ";
                    movieArray[i] += newWord;
                }                                
            }

            for (int i = 0; i < movieArray.Length; i++)
                Console.WriteLine(movieArray[i]);
        }
    }
}
