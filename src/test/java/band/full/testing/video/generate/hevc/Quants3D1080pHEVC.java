package band.full.testing.video.generate.hevc;

import static band.full.testing.video.encoder.EncoderParameters.FULLHD_MAIN8;
import static band.full.testing.video.generate.GeneratorFactory.HEVC;
import static java.lang.String.format;

import band.full.testing.video.executor.GenerateVideo;
import band.full.testing.video.generate.Quants3DBase;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Testing color bands separation / quantization step uniformity.
 *
 * @author Igor Malinin
 */
@GenerateVideo
public class Quants3D1080pHEVC extends Quants3DBase {
    @ParameterizedTest
    @MethodSource("params")
    public void quantsNearBlack(Args args) {
        generate(HEVC, FULLHD_MAIN8, args);
    }

    @Override
    protected String getFileName(Args args) {
        return format("HEVC/FullHD/Quantization/Quants3D1080pHEVC-%s%d",
                args.speed, args.lsb);
    }
}