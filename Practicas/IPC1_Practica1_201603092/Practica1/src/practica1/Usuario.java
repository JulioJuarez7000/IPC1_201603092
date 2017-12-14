/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;


public class Usuario {
     public String nickname;
     public String fechaDeNacimiento;
     public int score;

    public Usuario(String nickname, String fechaDeNacimiento) {
        this.nickname = nickname;
        this.fechaDeNacimiento=fechaDeNacimiento;
        score = 0;
    }

    public void setNickname(String nickname,String fechaDeNacimiento) {
        this.nickname = nickname;
        this.fechaDeNacimiento=fechaDeNacimiento;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
