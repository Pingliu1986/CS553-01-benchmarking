
package benchmarking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class NetworkServer {
	 ServerSocket ss;
	 boolean serverlive=false;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args[1]=="tcp"){
		new NetworkServer().starttcp();// TODO Auto-generated method stub
		}
		else if(args[1]=="udp"){
			
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
	
	@Override
	public void run() {
		
		
	}
	
}
