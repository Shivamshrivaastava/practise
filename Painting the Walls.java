import java.util.Arrays;
class PaintingTheWalls {
    public static void main(String[] args) {
        int[][] rooms = {
            {1, 0, 0, 1},
            {0, 1, 0, 1},
            {1, 1, 0, 0},
            {1, 0, 1, 1}
        };

        int[][] paintedRooms = paintWalls(rooms, 2);

        System.out.println("Rooms after painting:");
        for (int[] row : paintedRooms) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] paintWalls(int[][] rooms, int color) {
        int[][] paintedRooms = new int[rooms.length][rooms[0].length];

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j] == 1) {
                    paintedRooms[i][j] = color;
                } else {
                    paintedRooms[i][j] = 0; // Leave unpainted if the wall is already painted or non-existent
                }
            }
        }

        return paintedRooms;
    }
}