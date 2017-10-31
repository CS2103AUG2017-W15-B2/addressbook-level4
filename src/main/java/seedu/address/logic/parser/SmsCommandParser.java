package seedu.address.logic.parser;

import seedu.address.logic.commands.SmsCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.person.MassEmailPredicate;

import java.util.Arrays;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

public class SmsCommandParser {

    /**
     * Parses the given {@code String} of arguments in the context of the SmsCommand
     * and returns an SmsCommand object for execution.
     */

    public SmsCommand parse(String args)throws ParseException {
        String trimmedArgs = args.trim();

        if (trimmedArgs.isEmpty()) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, SmsCommand.MESSAGE_USAGE));
        }

        String[] nameKeywords = trimmedArgs.split("\\s+");

        // TODO: Change to TagPredicate or something
        return new SmsCommand(new MassEmailPredicate(Arrays.asList(nameKeywords)));
    }
}
