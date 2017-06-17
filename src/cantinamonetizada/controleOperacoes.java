/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantinamonetizada;

import cantinamonetizada.buffer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 *
 * @author 631410161
 */
public class controleOperacoes {

    public controleOperacoes() {
    }

//    public boolean verificaSaldo(int matricula) throws IOException {
//        buffer b = new buffer();
//        b.testebuffer();
//        return true;
//    }
	public static void main(String args[]) {

		File f = new File("data.txt");

		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Esse texto está sendo inserido");
			
			//INSERE UMA NOVA LINHA
			bw.newLine();
			
			bw.write("Continua sendo inserido em uma nova linha");
			
			bw.newLine();
			
			bw.write("Continua sendo inserido em uma 3ª linha");
			
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//EFETUANDO A LEITURA
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String s;
			
			//ENQUANTO EXISTE DADOS CONTINUA IMPRIMINDO
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("###### Erro: "+e.getMessage());
			e.printStackTrace();
		}
	}

}
