using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Facade
{
    class Program
    {
        public static void Main(string[] args)
        {
            MySqlHelper.UpdateDataSet
            DataSet ds = ExecuerDataset("Server=mail.menethil.net;Port=3306;Database=doc_list;User=root; Password=root","select * from sdp_video_list");

            foreach (DataRow row in ds.Tables[0].Rows)
            {
                Console.WriteLine(row["name"]);
            }
            Console.Read();
        }

        private static DataSet ExecuerDataset(string connectionString,String cmd)
        {
            DataSet ds = new DataSet();
            using (MySqlConnection connection = new MySqlConnection())
            {
                using (MySqlDataAdapter adapter = new MySqlDataAdapter(cmd, connection))
                {
                    connection.Open();
                    adapter.Fill(ds);
                }
            }

            return ds;
        }
    }
}
