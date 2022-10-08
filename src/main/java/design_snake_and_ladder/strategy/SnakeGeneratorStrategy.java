package design_snake_and_ladder.strategy;

import design_snake_and_ladder.model.BoardEntity;
import design_snake_and_ladder.model.board_entity.Ladder;
import design_snake_and_ladder.model.board_entity.Snake;
import org.apache.commons.math3.random.RandomDataGenerator;

import java.util.Set;

public class SnakeGeneratorStrategy implements BoardEntitiesGeneratorStrategy {

    private RandomDataGenerator randomDataGenerator = new RandomDataGenerator();

    @Override
    public BoardEntity generate(int size, Set<Integer> exclude) {
        int firstNumber = randomDataGenerator.nextInt(2, size);
        while(exclude.contains(firstNumber)) {
            firstNumber = randomDataGenerator.nextInt(2, size);
        }

        int secondNumber = randomDataGenerator.nextInt(2, firstNumber);
        while(exclude.contains(secondNumber)) {
            secondNumber = randomDataGenerator.nextInt(2, firstNumber);
        }


        return new Snake(firstNumber, secondNumber);
    }
}
