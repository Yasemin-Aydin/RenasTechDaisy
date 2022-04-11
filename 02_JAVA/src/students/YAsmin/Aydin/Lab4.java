package src.students.YAsmin.Aydin;

public class Lab4 {
    public static void main(String[] args) {

        String str = "AAABBCDD";
        int[] frequency = new int[str.length()];
        System.out.println("The entered string is "+str);
        char str1[] = str.toCharArray();
        for(int i = 0; i <str.length(); i++)
        {
            frequency[i] = 1;
            for(int j = i+1; j <str.length(); j++)
            {
                if(str1[i] == str1[j])
                {
                    frequency[i]++;

                    //Set str1[j] to 0 to avoid printing visited character
                    str1[j] = '0';
                }
            }
        }
        //Displays the characters and their corresponding frequency
        System.out.println("Frequencies of the characters in the string are as below: ");
        for(int i = 0; i <frequency.length; i++)
        {
            if(str1[i] != ' ' && str1[i] != '0')
                System.out.println(str1[i] + " " + frequency[i]);
        }
    }
}
