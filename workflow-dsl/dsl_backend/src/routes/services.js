const router = require("express").Router();
var request = require("request");
var request = require("request-promise");
var fs = require("fs");

let error = {
  err: "",
};

router.post("/transform", async (req, res) => {
  const sourcemodel = req.body.sourceModel;
  const sourcemetamodel = req.body.sourceMetaModel;
  const targetmetamodel = req.body.targetMetaModel;
  const scriptEtl = req.body.scriptEtl;

  var options = {
    method: "POST",
    url: "http://34.107.29.78.sslip.io/api/mms/transform/",
    headers: {},
    formData: {
      sourceModel: {
        value: fs.createReadStream(
          `/home/arsene/IdeaProjects/model-management-services/services/src/main/resources/artifacts/models/${sourcemodel}`
        ),
        options: {
          filename: sourcemodel,
          contentType: null,
        },
      },
      sourceMetaModel: {
        value: fs.createReadStream(
          `/home/arsene/IdeaProjects/model-management-services/services/src/main/resources/artifacts/metamodels/${sourcemetamodel}`
        ),
        options: {
          filename: sourcemetamodel,
          contentType: null,
        },
      },
      targetMetaModel: {
        value: fs.createReadStream(
          `/home/arsene/IdeaProjects/model-management-services/services/src/main/resources/artifacts/metamodels/${targetmetamodel}`
        ),
        options: {
          filename: targetmetamodel,
          contentType: null,
        },
      },
      etlScript: {
        value: fs.createReadStream(
          `/home/arsene/IdeaProjects/model-management-services/services/src/main/resources/artifacts/script/${scriptEtl}`
        ),
        options: {
          filename: scriptEtl,
          contentType: null,
        },
      },
    },
  };
  await request(options)
    .then((result) => {
      res.status(202).json({ message: result });
    })
    .catch((err) => {
      error.err = err.message;
      res.status(500).json(error);
    });
});

router.post("/validate", async (req, res) => {
  const modelV = req.body.model;
  const metamodel = req.body.metaModel;
  const scriptEvl = req.body.scriptEvl;

  const data = { modelV, metamodel, scriptEvl };

  var options = {
    method: "POST",
    url: "http://34.107.29.78.sslip.io/api/mms/validate/",
    headers: {},
    formData: {
      model: {
        value: fs.createReadStream(
          `/home/arsene/IdeaProjects/model-management-services/services/src/main/resources/artifacts/models/${modelV}`
        ),
        options: {
          filename: modelV,
          contentType: null,
        },
      },
      metaModel: {
        value: fs.createReadStream(
          `/home/arsene/IdeaProjects/model-management-services/services/src/main/resources/artifacts/metamodels/${metamodel}`
        ),
        options: {
          filename: metamodel,
          contentType: null,
        },
      },
      script: {
        value: fs.createReadStream(
          `/home/arsene/IdeaProjects/model-management-services/services/src/main/resources/artifacts/script/${scriptEvl}`
        ),
        options: {
          filename: scriptEvl,
          contentType: null,
        },
      },
    },
  };

  await request(options)
    .then((result) => {
      res.status(202).json({ message: result });
    })
    .catch((err) => {
      error.err = err.message;
      res.status(500).json(error);
    });

  // res.status(202).json(options);
});

router.post("/query", async (req, res) => {
  const modelV = req.body.model;
  const metamodel = req.body.metaModel;
  const scriptEol = req.body.scriptEol;

  var options = {
    method: "POST",
    url: "http://34.107.29.78.sslip.io/api/mms/query/",
    headers: {},
    formData: {
      model: {
        value: fs.createReadStream(
          `/home/arsene/IdeaProjects/model-management-services/services/src/main/resources/artifacts/models/${modelV}`
        ),
        options: {
          filename: modelV,
          contentType: null,
        },
      },
      metaModel: {
        value: fs.createReadStream(
          `/home/arsene/IdeaProjects/model-management-services/services/src/main/resources/artifacts/metamodels/${metamodel}`
        ),
        options: {
          filename: metamodel,
          contentType: null,
        },
      },
      script: {
        value: fs.createReadStream(
          `/home/arsene/IdeaProjects/model-management-services/services/src/main/resources/artifacts/script/${scriptEol}`
        ),
        options: {
          filename: scriptEol,
          contentType: null,
        },
      },
    },
  };

  await request(options)
    .then((result) => {
      res.status(202).json({ message: result });
    })
    .catch((err) => {
      error.err = err.message;
      res.status(500).json(error);
    });
});

router.post("/compare", async (req, res) => {
  const model1 = req.body.model1;
  const model2 = req.body.model2;
  const script = req.body.scriptEcl;

  var options = {
    method: "POST",
    url: "http://34.107.29.78.sslip.io/api/mms/compare/",
    headers: {},
    formData: {
      files: [
        {
          value: fs.createReadStream(
            `/home/arsene/IdeaProjects/model-management-services/services/src/main/resources/artifacts/models/${model2}`
          ),
          options: {
            filename: model2,
            contentType: null,
          },
        },
        {
          value: fs.createReadStream(
            `/home/arsene/IdeaProjects/model-management-services/services/src/main/resources/artifacts/models/${model1}`
          ),
          options: {
            filename: model1,
            contentType: null,
          },
        },
        {
          value: fs.createReadStream(
            `/home/arsene/IdeaProjects/model-management-services/services/src/main/resources/artifacts/script/${script}`
          ),
          options: {
            filename: script,
            contentType: null,
          },
        },
      ],
    },
  };

  await request(options)
    .then((result) => {
      res.status(202).json({ message: result });
    })
    .catch((err) => {
      error.err = err.message;
      res.status(500).json(error);
    });
});

module.exports = router;