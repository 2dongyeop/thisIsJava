package newCode.major.assignment.week6;

public class Vector {
    private int x, y, z;
    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int getX() { return x;}
    public int getY() { return y;}
    public int getZ() { return z;}

    public static void main(String[] args) {
        Vector vector1 = new Vector();
        Vector vector2 = new Vector();

        vector1.setXYZ(1,2,3);
        vector2.setXYZ(4,5,6);

        System.out.print("첫번째 벡터의 크기 : ");
        System.out.println(vectorSize(vector1));

        System.out.print("두번째 벡터의 크기 : ");
        System.out.println(vectorSize(vector2));

        System.out.print("두 벡터의 합 : ");
        vectorSum(vector1, vector2);

        System.out.print("두 벡터의 차 : ");
        vectorMinus(vector1, vector2);

        System.out.print("두 벡터의 내적 : ");
        System.out.println(vectorDot(vector1, vector2));

        System.out.print("첫번째 벡터의 방향 : ");
        vectorDirection(vector1);

        System.out.print("두번째 벡터의 방향 : ");
        vectorDirection(vector2);
    }
    public static int vectorSize(Vector vector) {
        int size = 0;
        size = (int) Math.sqrt(vector.x * vector.x + vector.y * vector.y + vector.z * vector.z);
        return size;
    }

    public static void vectorSum(Vector v1, Vector v2) {
        int sumX = v1.x + v2.x;
        int sumY = v1.y + v2.y;
        int sumZ = v1.z + v2.z;

        System.out.println("(" + sumX + ", " + sumY + ", " + sumZ + ")");
    }

    public static void vectorMinus(Vector v1, Vector v2) {
        int minusX = v1.x - v2.x;
        int minusY = v1.x - v2.y;
        int minusZ = v1.z - v2.z;

        System.out.println("(" + minusX + ", " + minusY + ", " + minusZ + ")");
    }

    public static int vectorDot(Vector v1, Vector v2) {
        int dotProduct = 0;
        dotProduct = v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
        return dotProduct;
    }

    public static void vectorDirection(Vector vector) {
        int size =  vectorSize(vector); //매개변수 벡터의 크기를 구함
        int xDir = vector.x / size; //각 성분을 크기로 나눠 단위벡터로 바꿔줌
        int yDir = vector.y / size;
        int zDir = vector.z / size;

        System.out.println("(" + xDir + ", " + yDir + ", " + zDir + ")");
    }
}
