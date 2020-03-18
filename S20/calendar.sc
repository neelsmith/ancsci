import edu.holycross.shot.coursecal._
import java.io.PrintWriter

def schedule : Unit = {
  val pg = "ghpages/schedule.md"
  val sched = Schedule("ancsci-topics2.txt", "ancsci2.yaml")
  println("Made Schedule instance. No geneate calendar.")
  val md = sched.markdownCalendar
  new PrintWriter(pg) { write(md); close }
  println("New schedule written to " + pg)
}


println("Write a new schedule in ghpages directory:")
println("\tschedule")
