
package benchmarking;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class NetworkServer {
	 private static ServerSocket ss=null;
	 private static boolean serverlive=false;
	 private static final int threadnum=2;
	 private static final TCPThread[] tcpthreads=new TCPThread[threadnum];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args[0]=="tcp"){
		new NetworkServer().starttcp();// TODO Auto-generated method stub
		}
		else if(args[0]=="udp"){
			
		}
	}
	public void starttcp(){
		try {
			ss=new ServerSocket(8888);
			serverlive=true;
			while(serverlive){
				Socket socket=ss.accept();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// TODO Auto-generated method stub
	}

}
class TCPThread implements Runnable{
	private DataInputStream inputstream=null;
	private PrintStream printstream = null;
	private Socket clientsocket=null;
	@Override
	public void run() {
		 
		
	}
	
}
