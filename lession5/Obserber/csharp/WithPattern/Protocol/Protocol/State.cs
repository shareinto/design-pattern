/**
 * Created by Administrator on 2017/1/17.
 */
namespace Protocol
{
    public class State
    {
        private int total;
        private int read;
        private bool completed;

        public int Total
        {
            get
            {
                return total;
            }

            set
            {
                total = value;
            }
        }

        public int Read
        {
            get
            {
                return read;
            }

            set
            {
                read = value;
            }
        }

        public bool Completed
        {
            get
            {
                return completed;
            }

            set
            {
                completed = value;
            }
        }
    }
}
