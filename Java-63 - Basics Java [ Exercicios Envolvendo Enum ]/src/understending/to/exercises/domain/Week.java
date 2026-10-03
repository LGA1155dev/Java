package understending.to.exercises.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Week {
    private DaysOfWeek daysOfWeek;

    @Override
    public String toString(){
        return "Dia da semana: " + daysOfWeek;
    }
}
