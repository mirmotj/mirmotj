
public class TestCodeProject2 {

	public static void main(String[] args) {
		boolean valid = true;
		char[][] puzzle = {	{'1','2','3'},
							{'4','5','6'},
							{'7','8','9'},
							{'1','2','3'},
							{'4','5','6'},
							{'7','8','9'},
							{'1','2','3'},
							{'4','5','6'},
							{'7','8','9'}};
		
		for(int i = 0;i < puzzle.length; i++) {
			for(int j = 0;j < puzzle[0].length; j++) {
				if(j % 3 == 0) {
					if(puzzle[i][j + 1] == puzzle[i][j] || puzzle[i][j + 2] == puzzle[i][j]) {
						valid = false;
					}
				}
				if(j % 3 == 1) {
					if(puzzle[i][j - 1] == puzzle[i][j] || puzzle[i][j + 1] == puzzle[i][j]) {
						valid = false;
					}
				}
				if(j % 3 == 2) {
					if(puzzle[i][j - 1] == puzzle[i][j] || puzzle[i][j - 2] == puzzle[i][j]) {
						valid = false;
					}
				}
				if(i % 3 == 0) {
					if(puzzle[i + 1][j -(j % 3)] == puzzle[i][j] 
						||puzzle[i + 1][j -(j % 3) + 1] == puzzle[i][j] 
						||puzzle[i + 1][j -(j % 3) + 2] == puzzle[i][j]) {
						valid = false;
					}
					if(	puzzle[i + 2][j -(j % 3)] == puzzle[i][j] 
						||puzzle[i + 2][j -(j % 3) + 1] == puzzle[i][j] 
						||puzzle[i + 2][j -(j % 3) + 2] == puzzle[i][j]) {
							valid = false;
						}
				}
				if(i % 3 == 1) {
					if(puzzle[i - 1][j -(j % 3)] == puzzle[i][j] 
						||puzzle[i - 1][j -(j % 3) + 1] == puzzle[i][j] 
						||puzzle[i - 1][j -(j % 3) + 2] == puzzle[i][j]) {
						valid = false;
					}
					if(puzzle[i + 1][j -(j % 3)] == puzzle[i][j] 
							||puzzle[i + 1][j -(j % 3) + 1] == puzzle[i][j] 
							||puzzle[i + 1][j -(j % 3) + 2] == puzzle[i][j]) {
							valid = false;
					}
				}
				if(i % 3 == 2) {
					if(puzzle[i - 1][j -(j % 3)] == puzzle[i][j] 
						||puzzle[i - 1][j -(j % 3) + 1] == puzzle[i][j] 
						||puzzle[i - 1][j -(j % 3) + 2] == puzzle[i][j]) {
						valid = false;
					}
					if(puzzle[i - 2][j -(j % 3)] == puzzle[i][j] 
						||puzzle[i - 2][j -(j % 3) + 1] == puzzle[i][j] 
						||puzzle[i - 2][j -(j % 3) + 2] == puzzle[i][j]) {
							valid = false;
					}
				}
			}
		}
		
		System.out.print(valid);
	}
}
