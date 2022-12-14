
package ca.sait.servlets;

import ca.sait.models.Note;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NoteServlet extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to read files
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));

        String title = br.readLine();
        String contents = br.readLine();
        
        Note note = new Note(title, contents);
        
        request.setAttribute("note", note);
        
        String edit = request.getParameter("edit");
        
        if(edit != null)
        {
            this.getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
        else
        {
            this.getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
        
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
        String title = request.getParameter("title");
        String contents = request.getParameter("contents");
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
      
            
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 

        pw.println(title);
        pw.println(contents);
        
        pw.close();
        
        response.sendRedirect("note");
        
      
    }

   

}
