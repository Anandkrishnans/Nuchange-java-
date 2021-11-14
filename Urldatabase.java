
import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

class urldatabase
{
    private static HashMap<String,String> listUniqueShortKey = new HashMap<String,String>();
    private static HashMap<String,Integer> listUrlCount = new HashMap<String,Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {          
            String str = sc.nextLine();
            String[] command = str.split("\\s");
            if("".equals(str))
            {
                System.out.println("Enter command and try again!");
                continue;
            }
            else if("exit".equals(command[0]))
            {
                break;
            }
            else
            {
                if(command.length > 1)
                {
                     if("storeurl".equals(command[0]) && command[1].length() > 0)
                     {
                     String shortId = UUID.randomUUID().toString().replace("-","").substring(0,8);
                     while(listUniqueShortKey.containsValue(shortId))
                     {
                        shortId = UUID.randomUUID().toString().replace("-","").substring(0,8);
                     }
                     listUniqueShortKey.put(command[1], shortId);
                     listUrlCount.put(command[1], 0);
                     continue;
                     }
                      else if( "get".equals(command[0]) &&command[1].length() > 0 )
                     {
                           if(listUrlCount.containsKey(command[1]))
                            {
                            System.out.println("The unique short key is " + listUniqueShortKey.get(command[1]));
                            int repeats = listUrlCount.get(command[1]) + 1;
                            listUrlCount.put(command[1],repeats);
                            }
                            continue;
                     }
                      else if("count".equals(command[0]) && command[1].length() > 0 )
                        {
                            if(listUrlCount.containsKey(command[1]))
                            {
                             int repeats = listUrlCount.get(command[1]);
                             System.out.println( command[1] + " count = " + String.valueOf(repeats));
                            }
                         continue;
                         }
               } 
        else if("list".equals(command[0]) && command.length == 1 )
                    {
                     System.out.println("list of urls entered and their count ");
                        for(String key : listUrlCount.keySet())
                        {
                        int repeats = listUrlCount.get(key);
                        System.out.println(key + " ------ " + String.valueOf(repeats));
            }
                    continue;
                     }
                    else
                {
                    System.out.println(" wrong command check and try again ");
                    continue;
                }
            }
        }
        
    }

}