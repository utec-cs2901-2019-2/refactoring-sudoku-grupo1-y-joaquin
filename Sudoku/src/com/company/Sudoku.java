package com.company;

import java.util.Random;

public class Sudoku {
    private int [][]matrix;
    private int [][]changedMatrix;
    private int emptySpaces;


    public Sudoku(int [][] matrix){
        this.matrix=matrix;
    }

    public void startGame(){

        changeMatrix();
        int i = 0;
        showMatrix(changedMatrix);

        while(i<this.emptySpaces) {
            insertValue(2, 2);
            showMatrix(changedMatrix);
            i = i + 1;
        }
        verify();


    }

    public void changeMatrix(){
        this.changedMatrix = this.matrix;
        Random random = new Random();
        int i =0;
        while(i<51) {
            i=i+1;
            int randomNum1 = random.nextInt((9 - 1) + 1) + 1;
            int randomNum2 = random.nextInt((9 - 1) + 1) + 1;

            this.changedMatrix[randomNum1][randomNum2]=0;
        }

    }

    public void showMatrix(int [][] matrix){

    }

    public boolean verify(){



    }

    public void insertValue(int row, int column){

    }

}
