package clases;

import java.sql.Date;
import java.util.List;

public class Servicio {
	

public static void main(String[] args) {
	DBStub db = new DBStub();
	Repositorio repo = new Repositorio(db);
	MailerStub mailer = new MailerStub();
	Servicio servicio = new Servicio(repo, mailer);
}


public Servicio(Repositorio repo, MailerStub mailer) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public ToDo crearToDo(String nombre, String descripcion, Date fechaLimite) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void agregarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void marcarComoCompletada(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> listarPendientes() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void checkAndNotifyOverdues() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

}
