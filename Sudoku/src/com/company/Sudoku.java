package com.company;

public class Sudoku {
    private int [][]matrix;
    private int [][]changedMatrix;
    private int emptySpaces;


    public Sudoku(int [][] matrix){
        this.matrix=matrix;
    }

    public void startGame(){

        this.changedMatrix = changeMatrix(this.matrix);
        int i = 0;
        showMatrix(changedMatrix);

        while(i<this.emptySpaces) {
            insertValue(2, 2);
            showMatrix(changedMatrix);
            i = i + 1;
        }
        verify();


    }

    public int[][] changeMatrix(int [][]matrix){

    }

    public void showMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
    }

    public void verify(){

    }

    public void insertValue(int row, int column){

    }

}
