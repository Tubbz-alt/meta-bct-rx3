#Fix problem with evtest checksum by effectively backporting from daisy

SRCREV = "67f3dfefb0b5708ad5b692f19c1a3a5b135264ca"
SRC_URI = "git://anongit.freedesktop.org/evtest;protocol=git"

PV = "1.25+${SRCPV}"

S = "${WORKDIR}/git"
