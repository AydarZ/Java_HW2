package HW2;

public class HW2 {
    public static void main(String[] args) {
        String json = "'name':Ivanov, 'country':Russia, 'city':Moscow, 'age':null";
        StringBuilder sb = new StringBuilder();
        sb.append("select * from students where ");
        String[] arrJson = json.split(", ");
        for (String element : arrJson) {
            String[] ar = element.split(":");
            if (ar[1] != "null") {
                sb.append(ar[0] + "=" + ar[1] + " and ");
            }
        }
        System.out.println(sb);
    }
}
