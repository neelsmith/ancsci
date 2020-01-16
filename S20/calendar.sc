import edu.holycross.shot.coursecal._

val sched = Schedule("ancsci-topics.txt", "ancsci.yaml")
val md = sched.markdownCalendar

import java.io.PrintWriter

new PrintWriter("ghpages/schedule.md") { write(md); close }
