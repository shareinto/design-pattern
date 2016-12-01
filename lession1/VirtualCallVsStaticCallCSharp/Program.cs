using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VirtualCallVsStaticCallCSharp
{
    class Program
    {
        public static object StopWatch { get; private set; }

        static void Main(string[] args)
        {
            int count = 1000000000;
            while (true)
            {
                Console.WriteLine("dispatch: " + Dispath(count));
                Console.WriteLine("non-dispatch: " + NonDispath(count));
            }
        }
        private static long Dispath(int count)
        {
            Stopwatch watch = new Stopwatch();
            watch.Start();
            Base b = new Derive();
            while(count --> 0)
            {
                b.increase();
            }
            watch.Stop();
            return watch.ElapsedMilliseconds;
        }

        private static long NonDispath(int count)
        {
            Stopwatch watch = new Stopwatch();
            watch.Start();
            Alone a = new Alone();
            while (count-- > 0)
            {
                a.increase();
            }
            watch.Stop();
            return watch.ElapsedMilliseconds;
        }
    }

    class Base
    {
        volatile int tick;
        public virtual void increase()
        {
            tick++;
        }
    }

    class Derive : Base
    {
	    volatile int tick;
	    public override void increase()
        {
            tick++;
        }
    }

    class Alone
    {    
	    volatile int tick;
	    public void increase()
        {
            tick++;
        }
    }
}
