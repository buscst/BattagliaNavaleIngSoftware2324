package BattagliaNavaleProject.Control;

import java.io.IOException;

import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ;

import BattagliaNavaleProject.formGui.DoubleGameGridView;
import BattagliaNavaleProject.form.LoginModel;

public class ConnectionControl 
{
	static ZContext context = new ZContext();
	static ZMQ.Socket socket = context.createSocket(SocketType.REQ);
	String[] arrayMsg = null;
	private static LoginModel model;
	
	public static void main(String[] args) throws IOException
    {
		try  {
        System.out.println("Connecting to th server");

  		//  Socket to talk to server
			socket.connect("tcp://localhost:5555");
		

        for (int requestNbr = 0; requestNbr != 10; requestNbr++) {
            String request = "Hello";
            System.out.println("Sending Hello " + requestNbr);
            socket.send(request.getBytes(ZMQ.CHARSET), 0);

            byte[] reply = socket.recv(0);
            System.out.println(
                "Received " + new String(reply, ZMQ.CHARSET) + " " +
                requestNbr
            );
        }

		}finally {}
		
		String sendMsg = model.getUserName();
		
		byte[] byteMsg = socket.recv(0);
		String rispostaMsg= new String(byteMsg, ZMQ.CHARSET);

		if(rispostaMsg.equals("Y"))
		{
			DoubleGameGridView DGG = new DoubleGameGridView(socket);
		}
		else
		{
			//Qui dobbiamo chiamare una funzione che faccia uscire a video nella schermata di attesa che qualcosa 
			//è andato storto nella connessione
			System.out.println("C'è stato un errore nella connessione.");
		}
		
		
    }
}
