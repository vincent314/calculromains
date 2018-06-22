import org.amshove.kluent.`should equal`
import org.amshove.kluent.shouldEqualTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

object RomainSpec: Spek({
  describe("additions romaines", {
      it("should assert true") {
          true shouldEqualTo true
      }
      it("should unpack") {
        unpack("XIX") `should equal` "XVIIII"
      }
  })
})